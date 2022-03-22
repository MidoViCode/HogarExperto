package com.tuvch.hogarexperto.dto.request;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BinnacleRequest {
    String userId;
    @JsonProperty("peso")
    String weight;
    @JsonProperty("talla")
    String size;
    @JsonProperty("turno")
    String shift;
    @JsonProperty("pulso")
    String pulse;
    @JsonProperty("presion")
    String pressure;
    @JsonProperty("temp")
    String temperature;
    @JsonProperty("lavGenitales")
    String genitalWash;
    @JsonProperty("duchaCompleta")
    String fullShower;
    @JsonProperty("lavadoDientes")
    String wahsTeeth;
    @JsonProperty("horaDormir")
    String sleepTime;
    @JsonProperty("seLevanto")
    String getUp;
    @JsonProperty("vecesLevanto")
    String timesGetUp;
    @JsonProperty("comportamiento")
    String behavior;
    @JsonProperty("numMiccion")
    String numMiction;
    @JsonProperty("miccionObservacion")
    String mictionObservation;
    @JsonProperty("numDefecacion")
    String numDefecation;
    @JsonProperty("defecacionObservacion")
    String DefecObservation;

}
