package create_instance_pattern.abstract_factory_pattern.entity;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
    private String userId;
    private String password;
    private String userName;
}
