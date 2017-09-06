package lombok.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * Created by Nzm on 2017/9/6.
 */
@Setter
@Getter
@Accessors(chain = true)
@Builder
@ToString
public class Student {

    private String no;

    private String name;
    @Builder.Default
    private Integer age = 23;
    private List<String> changeIdList;


}
