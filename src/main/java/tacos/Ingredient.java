package tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;
    //内部枚举类
    public static enum Type{
        WRAP,PROTEIN,VEGGIES,CHEESE,SAUCE
    }

}
