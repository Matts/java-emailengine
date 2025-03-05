package io.github.matts.emailengine.model.hook.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChangeData {
    private List<String> value;
    private List<String> added;
    private List<String> deleted;
}
