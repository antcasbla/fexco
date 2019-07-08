import sun.util.calendar.LocalGregorianCalendar;

public class TrafficInfo {
    private String plane;
    private String originAirport;
    private String destinationAirport;
    private InfoEnum info;
    private LocalGregorianCalendar.Date travelDate;
    // Soft delete, in order to delete the data only to the user's view
    private Boolean deleted;
    private Boolean incident;

    public TrafficInfo(String plane, String originAirport, String destinationAirport, InfoEnum info, LocalGregorianCalendar.Date travelDate, Boolean deleted, Boolean incident) {
        this.plane = plane;
        this.originAirport = originAirport;
        this.destinationAirport = destinationAirport;
        this.info = info;
        this.travelDate = travelDate;
        this.deleted = deleted;
        this.incident = incident;
    }

    public String getPlane() {
        return plane;
    }

    public void setPlane(String plane) {
        this.plane = plane;
    }

    public String getOriginAirport() {
        return originAirport;
    }

    public void setOriginAirport(String originAirport) {
        this.originAirport = originAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public InfoEnum getInfo() {
        return info;
    }

    public void setInfo(InfoEnum info) {
        this.info = info;
    }

    public LocalGregorianCalendar.Date getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(LocalGregorianCalendar.Date travelDate) {
        this.travelDate = travelDate;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean getIncident() {
        return incident;
    }

    public void setIncident(Boolean incident) {
        this.incident = incident;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrafficInfo that = (TrafficInfo) o;
        return this.plane.equals(that.plane) &&
                this.originAirport.equals(that.originAirport) &&
                this.destinationAirport.equals(that.destinationAirport) &&
                this.info.equals(that.info) &&
                this.travelDate.equals(that.travelDate)&&
                this.deleted.equals(that.deleted)&&
                this.incident.equals(that.incident);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (plane == null ? 0 : plane.hashCode());
        hash = 31 * hash + (originAirport == null ? 0 : originAirport.hashCode());
        hash = 31 * hash + (destinationAirport == null ? 0 : destinationAirport.hashCode());
        hash = 31 * hash + (info == null ? 0 : info.hashCode());
        hash = 31 * hash + (travelDate == null ? 0 : travelDate.hashCode());
        hash = 31 * hash + (deleted == null ? 0 : deleted.hashCode());
        hash = 31 * hash + (incident == null ? 0 : incident.hashCode());
        return hash;
    }

    @Override
    public String toString() {
        return "TrafficInfo{" +
                "plane='" + plane + '\'' +
                ", originAirport='" + originAirport + '\'' +
                ", destinationAirport='" + destinationAirport + '\'' +
                ", info='" + info.toString() + '\'' +
                ", travelDate='" + travelDate + '\'' +
                ", deleted='" + deleted + '\'' +
                ", incident='" + incident + '\'' +
                '}';
    }
}
