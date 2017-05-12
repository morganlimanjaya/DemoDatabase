package sg.edu.rp.c346.demodatabase;

import java.io.Serializable;

/**
 * Created by 15017171 on 12/5/2017.
 */

public class Task implements Serializable {
    private int id;
    private String description;
    private String date;

    public Task(int id, String description, String date) {
        this.id = id;
        this.description = description;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }
}

