

public class PasswordReset {
    
    public static void main(String[] args) {
        
        // Class to hold user data
        class User {
            private String username;
            private String email;
            private String password;
            
            public User(String username, String email, String password) {
                this.username = username;
                this.email = email;
                this.password = password;
            }
            
            public String getUsername() {
                return username;
            }
            
            public String getEmail() {
                return email;
            }
            
            public String getPassword() {
                return password;
            }
            
            public void setPassword(String resetPassword) {
                this.password = resetPassword;
            }
        }
        
        // Class to handle user password reset
        class PasswordResetHandler {
            public void resetPassword(User user) {
                // Generate new random password
                String newPassword = generateRandomPassword();
                
                // Set the new password to the user
                user.setPassword(newPassword);
                
                // Send the new password to user's registered mail
                sendPasswordToMail(user.getEmail(), newPassword);
            }
            
            private String generateRandomPassword() {
                // Generate random password logic
                return "random_password";
            }
            
            private void sendPasswordToMail(String email, String password) {
                // Logic to send password to user's email
            }
        }
    }
}