package model;

import java.util.Objects;
import java.util.StringJoiner;



public class Task implements Comparable<Task>{
    private int id;
    private String title;
    private Status status;

    public Task(int id, String title, Status status) {
        this.id = id;
        this.title = title;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Task.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("title='" + title + "'")
                .add("status=" + status)
                .toString();
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;

        return id == task.id && Objects.equals(title, task.title) && status == task.status;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(title);
        result = 31 * result + Objects.hashCode(status);
        return result;
    }

    @Override
    public int compareTo(Task t) {
        return this.id-t.id;
    }
}
