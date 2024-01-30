package com.jsp.Intime.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jsp.Intime.Entity.WomenProducts;

public interface WomenRepository  extends JpaRepository<WomenProducts,  Integer>
{

}
