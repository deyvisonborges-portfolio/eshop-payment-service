package com.eshop.backendpaymentapi.core.artifacts.payment.repository;

import com.eshop.backendpaymentapi.core.artifacts.payment.Payment;
import com.eshop.backendpaymentapi.core.artifacts.payment.PaymentSearchQuery;
import com.eshop.backendpaymentapi.lib.Pagination;
import com.eshop.backendpaymentapi.lib.domain.repository.BaseRepositoryContract;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface PaymentRepositoryContract extends BaseRepositoryContract<Payment> {
  Pagination<Payment> findAll(PaymentSearchQuery query);
}
