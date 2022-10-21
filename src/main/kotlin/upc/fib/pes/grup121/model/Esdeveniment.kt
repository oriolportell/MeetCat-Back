package upc.fib.pes.grup121.model

import org.hibernate.annotations.DynamicUpdate
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@DynamicUpdate
@Table(name = "esdeveniments")
data class Esdeveniment(
    @Id  @GeneratedValue(strategy = GenerationType.AUTO) var id: Long?,
    var titol: String,
    var subtitol: String?,
    var descripcio: String?,
    var dataInici: LocalDateTime,
    var dataFi: LocalDateTime?,
    var link: String?,
    var nomLloc: String?,
    var coordenades: String?,
    var address: String?,
    var lastUpdate: LocalDateTime? = null,
    var createdDate: LocalDateTime? = null
)