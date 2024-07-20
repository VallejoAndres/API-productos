package com.ug.hotels.respositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ug.hotels.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByNombreContainingIgnoreCase(String nombre);
    List<Producto> findByPrecioBetween(double preciomin, double preciomax);
}
