package io.github.matts.emailengine.model.response;

import io.github.matts.emailengine.model.AccountEntry;
import io.github.matts.emailengine.model.response.FilterResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccountFilterResponse extends FilterResponse {
    private List<AccountEntry> accounts;
}
