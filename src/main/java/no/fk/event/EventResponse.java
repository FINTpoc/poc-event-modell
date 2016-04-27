package no.fk.event;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventResponse")
public class EventResponse {
    @XmlElement(required = true)
    private String status;

    @XmlElement(required = true)
    private String message;

    public EventResponse() {
    }

    public EventResponse(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
