package ru.netology

const val PERCENTTRANSACTION: Double = 0.0075
const val MINMONEYTRANSFER: UInt = 3500u

fun main() {

	print("Введите сумму перевода в рублях: ")

	val transactionRub = (readln().toUInt() * 100u).toDouble()
	val moneyTransferFee = (transactionRub * PERCENTTRANSACTION).toUInt()
	val amountKop = if (moneyTransferFee > MINMONEYTRANSFER) moneyTransferFee else MINMONEYTRANSFER
	val allPayment = (amountKop + transactionRub.toUInt()) / 100u

	println("Ваша комиссия за перевод составит $amountKop коп.")
	println("Сумма перевода, включая комиссию: $allPayment руб.")
}