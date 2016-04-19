package no.fk.event;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@XmlRootElement
@XmlType(name = "Event")
public class Event<T> {
    private String id;
    private String verb;
    private Type type;
    private long time;
    private List<T> data;

    public Event() {
        this.id = UUID.randomUUID().toString();
        this.time = System.currentTimeMillis();
    }

    public Event(String verb, Type type) {
        this.id = UUID.randomUUID().toString();
        this.verb = verb;
        this.type = type;
        this.time = System.currentTimeMillis();
        this.data = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public void addData(T data) {
        this.data.add(data);
    }
}
