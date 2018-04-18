package models;

import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

public class ServiceAccount extends Model {

    private String username;
    private String password;

}
