Here is a very simple, real-world example of Liskov Substitution Principle (LSP) using a Banking System.

❌ The Violation: The "No-Withdrawal" Account
Imagine you have a base class for bank accounts. You then create a FixedDepositAccount.
In real life, you often cannot withdraw from a Fixed Deposit until it matures.

✅ The Professional Solution (LSP Compliant)
We split the logic into hierarchies based on what the accounts can actually do.

Result: Now, your ATM software will only accept a WithdrawableAccount.
You literally cannot pass a FixedDepositAccount to the withdrawal logic,
preventing the crash before it even happens.
