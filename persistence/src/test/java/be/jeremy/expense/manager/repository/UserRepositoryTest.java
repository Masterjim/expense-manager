package be.jeremy.expense.manager.repository;

import be.jeremy.expense.manager.config.DataSourceTestConfiguration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringJUnitConfig(classes = DataSourceTestConfiguration.class)
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void findById() {
        assertThat(userRepository.findById(1L))
                .isNotEmpty()
                .hasValueSatisfying(u -> {
                    assertThat(u.getId()).isEqualTo(1L);
                    assertThat(u.getFirstName()).isEqualTo("Jeremy");
                    assertThat(u.getLastName()).isEqualTo("Vanpé");
                    assertThat(u.getUsername()).isEqualTo("Masterjim");
                });
    }

}