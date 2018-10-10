package blog.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table
public class Tourist {

    @Id
    @Column
    private UUID touristId;

    private String name;
    private String meta;


}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-10 11:36
 **/
