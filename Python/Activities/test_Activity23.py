import pytest

@pytest.fixture
def n_list():
    return [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    

def test_sum(n_list):
    sum = 0
    for n in n_list:
        sum += n

    
    assert sum == 55