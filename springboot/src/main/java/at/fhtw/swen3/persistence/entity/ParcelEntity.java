package at.fhtw.swen3.persistence.entity;

import at.fhtw.swen3.services.dto.TrackingInformation;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ParcelEntity {
    @Id
    @Pattern(regexp = "^[A-Z0-9]{9}$")
    private String trackingId;
    @NotNull(message = "Weight cannot be null")
    @Min(value = 0, message = "Weight cannot be negative")
    private Float weight;
    @NotNull(message = "Recipient ID cannot be null")
    private Long recipient;
    @NotNull(message = "Sender ID cannot be null")
    private Long sender;
    @NotNull(message = "State cannot be null")
    private TrackingInformation.StateEnum state;
    @NotNull(message = "Visited Hops cannot be null")
    private List<Long> visitedHops;
    @NotNull(message = "Future Hops cannot be null")
    private List<Long> futureHops;
}
