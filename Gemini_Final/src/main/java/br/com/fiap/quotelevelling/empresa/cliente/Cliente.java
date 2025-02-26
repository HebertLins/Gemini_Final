package br.com.fiap.quotelevelling.empresa.cliente;

import br.com.fiap.quotelevelling.empresa.Empresa;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_CLIENTE", uniqueConstraints = {
        @UniqueConstraint(name = "UK_CLI_CNPJ", columnNames = "CNPJ_CLIENTE")
})
@DiscriminatorValue("CLIENTE")
public class Cliente extends Empresa {

    @Column(name = "CNPJ_CLIENTE", nullable = false)
    @NotBlank
    @Size(min = 14 ,  max = 14, message = "Um CNPJ deve conter 14 digítos")
    private String cnpj_cliente;

}