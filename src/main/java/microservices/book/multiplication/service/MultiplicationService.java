package microservices.book.multiplication.service;


import microservices.book.multiplication.domain.Multiplication;
import microservices.book.multiplication.domain.MultiplicationResultAttempt;

import java.util.List;

public interface MultiplicationService {

    /* 두 개의 무작위 인수(11~99)를 담은 {@link Multiplication} 객체를 생성 */
    Multiplication createRandomMultiplication();

    /* 곱셈 결과가 맞으면 true, 아니면 false */
    boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);

    public List<MultiplicationResultAttempt> getStatsForUser(String userAlias);
}
