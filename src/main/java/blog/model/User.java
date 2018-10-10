package blog.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table
public class User {

    @Id
    @Column
    private UUID userId;

    private String username;
    private String password;


}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-10 11:36
 **/
