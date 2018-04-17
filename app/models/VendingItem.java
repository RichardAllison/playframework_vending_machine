package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class VendingItem extends Model {

    @Id
    public Long id;

    @Constraints.Required
    public String name;

    @Constraints.Required
    public double price;

    @Constraints.Required
    public int quantity;

    public static final Finder<Long, VendingItem> find = new Finder<>(VendingItem.class);


}

