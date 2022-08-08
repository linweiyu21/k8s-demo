package org.daisy.indicator

import io.micronaut.health.HealthStatus
import io.micronaut.management.health.indicator.HealthIndicator
import io.micronaut.management.health.indicator.HealthResult
import io.micronaut.management.health.indicator.annotation.Liveness
import jakarta.inject.Singleton
import org.reactivestreams.Publisher
import reactor.core.publisher.Flux

@Singleton
@Liveness
class LivenessIndicator implements HealthIndicator {
    @Override
    Publisher<HealthResult> getResult() {
        Flux.just(HealthResult.builder('liveness').status(HealthStatus.UP).build())
    }
}
