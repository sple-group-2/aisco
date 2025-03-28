#!/bin/bash
source ~/.zshrc  

cleanup() {
    pkill -P $$
    exit 1
}

trap cleanup SIGINT

java -cp aisco.product.berbagidonasi --module-path aisco.product.berbagidonasi -m aisco.product.berbagidonasi &

wait