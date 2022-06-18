package ru.itmo.objmodels;

import jakarta.persistence.*;
import lombok.*;

@ToString(callSuper = true)
@Entity
@Getter
@Setter
@NonNull
@NoArgsConstructor

public class Mountain extends BaseId {
    private String title;
    private String country;
    private int high;

    public Mountain(String title, String country, int high) {
        setTitle(title);
        setCountry(country);
        setHigh(high);
    }

    @OneToOne
    @JoinColumn(name = "group_list_id")
    private Group groupList;
}