
package com.example.file_upload;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class FileController {

    // Folder where files are stored
    private final Path uploadDir = Paths.get("uploads");

    // Show upload page
    @GetMapping("/")
    public String home() {
        return "upload";
    }

    // Upload file
    @PostMapping("/upload")
    public String uploadFile(@RequestParam MultipartFile file, Model model)
            throws IOException {

        // Create folder if not exists
        if (!Files.exists(uploadDir)) {
            Files.createDirectories(uploadDir);
        }

        // Create full file path
        Path filePath = uploadDir.resolve(file.getOriginalFilename());

        // Save file
        Files.write(filePath, file.getBytes());

        // Send data to HTML
        model.addAttribute("msg", "File uploaded: " + file.getOriginalFilename());
        model.addAttribute("fileName", file.getOriginalFilename());

        return "upload";
    }

    // Download file
    @GetMapping("/download/{fileName}")
    @ResponseBody
    public Resource downloadFile(@PathVariable String fileName)
            throws MalformedURLException {

        Path filePath = uploadDir.resolve(fileName);
        return new UrlResource(filePath.toUri());
    }
}

