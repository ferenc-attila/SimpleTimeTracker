package datahandling.data;

import java.time.LocalDateTime;

public class Recording {

    private final int identifier;
    private String description;
    private boolean isActive;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String notes;

    public Recording(int identifier, String description, LocalDateTime startTime) {
        this.identifier = identifier;
        this.description = description;
        isActive = true;
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        StringBuilder recordString = new StringBuilder();
        recordString.append("Id: ");
        recordString.append(identifier);
        recordString.append("\nStart time: ");
        recordString.append(this.startTime.toString());
        recordString.append("\nEnd time: ");
        recordString.append(createEndTimeString());
        recordString.append("\nIn progress: ");
        recordString.append(getActiveString());
        recordString.append("\nDescription: ");
        recordString.append(description);
        recordString.append("\nNotes: ");
        recordString.append(notes);
        return recordString.toString();
    }

    private String createEndTimeString() {
        if (this.endTime == null) {
            return "In progress";
        } else {
            return this.endTime.toString();
        }
    }

    private String getActiveString() {
        if (isActive()) {
            return "yes";
        } else {
            return "no";
        }
    }

    public int getIdentifier() {
        return identifier;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
