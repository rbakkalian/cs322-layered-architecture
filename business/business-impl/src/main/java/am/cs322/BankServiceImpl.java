package am.cs322;

import am.cs322.model.Banking;
import am.cs322.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BankServiceImpl implements BankService {
    BankingRepository bankingRepository;
    UserRepository userRepository;

    public BankServiceImpl(BankingRepository bankingRepository, UserRepository userRepository) {
        this.bankingRepository = bankingRepository;
        this.userRepository = userRepository;
    }

    @Override
    public String createAccount(boolean isDebit, long user_id) {
        Optional<User> user = userRepository.findById(user_id);
        user.ifPresent(value -> bankingRepository.save(new Banking(isDebit, value)));
        return user.isPresent()? "Account Created" : "Account is not Created";
    }
}
