package com.example.model.practice;

public class User {
    private String name;
        private int age;
        private String email;

        public User() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getEmail() {      // ✅ VERY IMPORTANT
            return email;
        }

        public void setEmail(String email) {   // ✅ VERY IMPORTANT
            this.email = email;
        }
    }


