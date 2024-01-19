package designpattern.chainofresponsibility

sealed interface Request {
    data object Help : Request
    data object Print : Request
    data class Preview(val param1: String, val param2: String) : Request
    data object Random : Request
}