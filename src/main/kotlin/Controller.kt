package simuladorDistanciaKm

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.math.round
import kotlin.random.Random

@RestController
@RequestMapping("")
class Controller{
    @GetMapping("/obterDistancia")
    fun obterDistancia(latitudeOrigem: Double, latitudeDestino: Double, longitudeOrigem: Double, longitudeDestino: Double) : Double {
        return round(Random.nextDouble(1.00, 100.00))
    }
}