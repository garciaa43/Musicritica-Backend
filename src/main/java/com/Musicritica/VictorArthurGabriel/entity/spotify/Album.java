package com.Musicritica.VictorArthurGabriel.entity.spotify;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class Album {
    private String name;
    private String release_date;
    private List<Image> images;
    private List<Artists> artists;
}