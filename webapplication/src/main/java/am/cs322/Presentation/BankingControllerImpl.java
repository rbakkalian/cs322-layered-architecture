package am.cs322.Presentation;

import am.cs322.BankService;
import am.cs322.UserService;
import am.cs322.Presentation.model.CreateBankingRequest;
import am.cs322.model.UserDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/bank")
public class BankingControllerImpl implements BankingController {
    BankService bankService;

    public BankingControllerImpl(BankService bankService) {
        this.bankService = bankService;
    }

    @Override
    @PostMapping
    public String createAccount(@RequestBody CreateBankingRequest request) {
        return bankService.createAccount(request.isDebit(), request.id());
    }
}

