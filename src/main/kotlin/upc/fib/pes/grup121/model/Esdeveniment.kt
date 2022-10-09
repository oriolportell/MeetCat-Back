package upc.fib.pes.grup121.model

import org.hibernate.annotations.DynamicUpdate
import javax.persistence.*

@Entity
@DynamicUpdate
@Table(name = "esdeveniments")
data class Esdeveniment(
    @Id  @GeneratedValue(strategy = GenerationType.AUTO) var id: Long?,
    val titol: String,
    val descripcio: String
)