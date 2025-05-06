package com.sinensia.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ProductoConsumer {

	@RabbitListener(queues="cola.productos")
    public void recibirProducto(Producto producto) {
        System.out.println("🤡 Producto recibido: " + producto);
    }
}
