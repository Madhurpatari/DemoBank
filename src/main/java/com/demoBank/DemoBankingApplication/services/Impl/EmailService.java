package com.demoBank.DemoBankingApplication.services.Impl;

import com.demoBank.DemoBankingApplication.dto.EmailDetails;
import org.springframework.stereotype.Service;

@Service
public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
