package activities;

class CustomException extends Exception {
    private String message = null;
 
    public CustomException(String message) {
        this.message = message;
    }
 
    @Override
    public String getMessage() {
        return message;
    }
}
