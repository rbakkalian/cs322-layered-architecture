package am.cs322.Presentation;

import am.cs322.Presentation.model.CreateBankingRequest;
import am.cs322.model.UserDTO;

public interface BankingController {

    public String createAccount(CreateBankingRequest request);

}
