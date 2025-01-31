package com.example.dslist.dto;

public class ReplacementDTO {
    private Integer sourceIndex;
    private Integer destinationIndex;

    public Integer getSourceIndex() {
        return sourceIndex;
    }

    public ReplacementDTO setSourceIndex(Integer sourceIndex) {
        this.sourceIndex = sourceIndex;
        return this;
    }

    public Integer getDestinationIndex() {
        return destinationIndex;
    }

    public ReplacementDTO setDestinationIndex(Integer destinationIndex) {
        this.destinationIndex = destinationIndex;
        return this;
    }
}
