package es.um.asio.service.model.service.discovery;

public enum Status {

    UP("UP"),DOWN("DOWN"),UNKNOWN("UNKNOWN");

    private String text;

    Status(String text) {
        this.text = text;
    }


    public static Status fromString(String a) {
        for (Status action : Status.values()) {
            if (action.text.equalsIgnoreCase(a)) {
                return action;
            }
        }
        return null;
    }
}
