package blog.model;

import javax.persistence.*;

@Entity
@Table
public class Tourist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer touristId;

    private String name;
    private String info;


}
/**
 * @program: blog
 * @description:
 * @author: Dainy33
 * @create: 2018-10-10 11:36
 **/
