package response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Schedule implements Serializable {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    private String scheduleId;

    private Date startTime;

    private Date endTime;

    @ManyToOne
    @JoinColumn(name = "studio_id")
    private Studio studio;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id") // joining column bisa pake joinColumn atau mappedBy pada @OneToMany
    private Movie movie;

    private static class Studio {
    }
}