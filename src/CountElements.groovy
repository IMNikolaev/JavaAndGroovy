def countElements(list) {
  list.countBy { it }
}

def numbers = [1, 3, 4, 5, 1, 5, 4]
def result = countElements(numbers)
println result