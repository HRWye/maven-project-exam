package ru.itmo.objmodels;

import jakarta.persistence.*;
import lombok.*;
import  java.lang.String;

@EqualsAndHashCode(callSuper = true)
@Entity
@Getter
@Setter
@ToString(callSuper = true)
@NonNull
@RequiredArgsConstructor

public class Climber extends BaseId {
    private String name;
    private String address;


    public Climber(String name, String address) {
        setName(name);
        setAddress(address);
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @Setter
    private Group groupList;

    public String getNameAndAddress(){
        return name + ", " + address;
    }
}
