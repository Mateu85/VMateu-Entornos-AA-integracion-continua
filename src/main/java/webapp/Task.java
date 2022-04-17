package webapp;

public class Task {

    private String title;
    private String description;
    private String location;

    public Task(String titulo, String autor, String editorial) {
        this.title = titulo;
        this.description = autor;
        this.location = editorial;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
