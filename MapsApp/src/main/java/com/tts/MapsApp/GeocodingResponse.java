package com.tts.MapsApp;


import lombok.Data;
import java.util.List;

/**
 * @author Michele Lanning
 * @version 2019-08-03
 */
@Data
public class GeocodingResponse {
    private List<Geocoding> results;
}



