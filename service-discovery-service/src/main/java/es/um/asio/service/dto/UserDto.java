package es.um.asio.service.dto;

import com.izertis.libraries.audit.dto.AuditableDto;
import es.um.asio.service.model.Role;
import es.um.asio.service.util.ValidationConstants;
import es.um.asio.service.validation.group.Create;
import es.um.asio.service.validation.group.Update;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.*;
import java.util.Set;

/**
 * Application user DTO.
 */
@Getter
@Setter
@ToString(includeFieldNames = true)
public class UserDto extends AuditableDto {

    /**
     * The id.
     */
    @NotNull(groups = Update.class)
    @Null(groups = Create.class)
    private String id;

    /**
     * User real name.
     */
    @Size(min = 1, max = ValidationConstants.MAX_LENGTH_DEFAULT)
    private String name;

    /**
     * Email.
     */
    @NotEmpty
    @Email
    @Size(max = ValidationConstants.MAX_LENGTH_DEFAULT)
    private String email;

    /**
     * Flag that indicates whether user is enabled or not.
     */
    @NotNull
    private boolean enabled;

    /**
     * Flag that indicates whether credentials are expired or not.
     */
    @NotNull
    private boolean credentialsNonExpired;

    /**
     * Flag that indicates whether account are expired or not.
     */
    @NotNull
    private boolean accountNonExpired;

    /**
     * Flag that indicates whether account is expired or not.
     */
    @NotNull
    private boolean accountNonLocked;

    /**
     * User password.
     */
    @NotEmpty
    @Size(max = ValidationConstants.MAX_LENGTH_DEFAULT)
    private String password;

    /**
     * User name
     */
    @NotEmpty
    @Size(max = ValidationConstants.MAX_LENGTH_DEFAULT)
    private String username;

    /**
     * County
     */
    @NotEmpty
    @Size(max = ValidationConstants.MAX_LENGTH_DEFAULT)
    private String country;

    /**
     * City
     */
    @NotEmpty
    @Size(max = ValidationConstants.MAX_LENGTH_DEFAULT)
    private String city;

    /**
     * Language
     */
    @NotEmpty
    @Size(max = ValidationConstants.MAX_LENGTH_DEFAULT)
    private String language;

    /**
     * Address
     */
    @NotEmpty
    @Size(max = ValidationConstants.MAX_LENGTH_DEFAULT)
    private String address;

    /**
     * Flag that indicates if the password changes
     */
    @NotNull
    private boolean passwordChanged;

    /**
     * Roles
     */
    private Set<Role> roles;

    /**
     * Version
     */
    private Integer version;

}
