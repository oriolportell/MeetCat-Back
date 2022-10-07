package upc.fib.pes.grup121.model

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Table(name = "esdeveniments")
data class Esdeveniment(
    @Id  @GeneratedValue(strategy = GenerationType.AUTO) var id: Long,
    val titol: String,
    val descripcio: String
)
