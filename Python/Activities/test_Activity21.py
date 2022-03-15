import pytest

def test_Add():
    n1 = 20
    n2=100
    sum = n1+n2
    assert sum ==120

def test_diff():
    n1 = 100
    n2 = 80
    diff = n1-n2
    assert diff == 30

def test_multiply():
    n1 = 2
    n2= 5
    pro = n1*n2
    assert pro == 10

def test_divide():
    n1 = 10
    n2 = 5
    div = 10/5
    assert div == 2