package lombok.vo;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Created by Nzm on 2017/9/6.
 */

@Accessors(chain = true, fluent = true)
@Builder
@Data
public class Student {

    private String no;

    private String name;
    @Builder.Default
    private Integer age = 23;
    private List<String> changeIdList;


}
